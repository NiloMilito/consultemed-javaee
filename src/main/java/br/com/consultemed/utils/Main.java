package br.com.consultemed.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.consultemed.model.Agendamento;
import br.com.consultemed.model.Consulta;
import br.com.consultemed.model.DiasAtendimento;
import br.com.consultemed.model.Endereco;
import br.com.consultemed.model.Exame;
import br.com.consultemed.model.Medico;
import br.com.consultemed.model.Paciente;
import br.com.consultemed.service.impl.AgendamentoService;
import br.com.consultemed.service.impl.ConsultaService;
import br.com.consultemed.service.impl.MedicoService;
import br.com.consultemed.service.impl.PacienteService;

public class Main {
	public static void main(String[] args) {					
				
		Paciente paciente = new Paciente();		
		paciente.setNome("Danilo");
		paciente.setCpf("324.234.324-90");
		
		Endereco endereco = new Endereco();
		endereco.setEstado("PB");
		endereco.setCidade("Jo�o Pessoa");
		endereco.setBairro("Jardim Cidade Universit�ria");
		endereco.setRua("Rosa Farias Real");
		endereco.setNumero("122");
		paciente.setEndereco(endereco);
		
		paciente.setFicha(33);
		
		
		System.out.println("Paciente criado ");
		
		PacienteService pservice = new PacienteService();		
		pservice.salvar(paciente);	

		System.out.println("Paciente "+paciente.getNome() + " cadastrado com sucesso !");
		
		
		
		
		Medico medico = new Medico();
		
		medico.setNome("Racho Crolde");
		medico.setCpf("456.890.897-87");
		medico.setCrm("3432-3423-89");
		
		DiasAtendimento diasAtendimento = new DiasAtendimento();
		
		diasAtendimento.setSegunda(false);
		diasAtendimento.setTerca(true);
		diasAtendimento.setQuarta(false);
		diasAtendimento.setQuinta(true);
		diasAtendimento.setSexta(true);
		diasAtendimento.setSabado(false);
		diasAtendimento.setDomingo(false);
		
		medico.setDiasAtendimento(diasAtendimento);
		
		System.out.println("M�dico criado ");
		
		MedicoService mservice = new MedicoService();		
		mservice.salvar(medico);	
		
		System.out.println("M�dico "+medico.getNome() + " cadastrado com sucesso !");

		
		
		
		Consulta consulta = new Consulta();
		
		consulta.setDataConsulta(new Date());
		consulta.setMotivo("Dores Abdominais");
		
		Exame exame = new Exame();
		exame.setLaudo("Negativo");
		exame.setConsulta(consulta);
		
		List<Exame> exames = new ArrayList<>();
		exames.add(exame);
		
		consulta.setExames(exames);
		
		System.out.println("Consulta criada ");
		ConsultaService cservice = new ConsultaService();
		cservice.salvar(consulta);
		System.out.println("Consulta "+consulta.getMotivo()+ " cadastrado com sucesso !");
		
		
		Agendamento agendamento = new Agendamento();
		
		ConsultaService cService = new ConsultaService();
		Consulta consult = (Consulta) cService.buscar(1L);
		agendamento.setConsulta(consult);
				
		agendamento.setPaciente(paciente);
		agendamento.setDataAgendamento(new Date());
		
		System.out.println("Agendamento criado ");
		
		AgendamentoService aservice = new AgendamentoService();
		aservice.alterar(agendamento);
		System.out.println("Agendamento "+agendamento.getConsulta().getMotivo() + " cadastrado com sucesso !");


	}

}
