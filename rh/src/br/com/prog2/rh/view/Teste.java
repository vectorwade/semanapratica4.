package br.com.prog2.rh.view;

public class Teste {
	package br.com.prog2.rh.view;
	import java.sql.Connection;
	import br.com.prog2.rh.persistencia.ConnectionFactory;
	public class Teste {
		public static void main(String[] args) {
			
			Empregado emp = new Empregado();
			EmpregadoController controller = new EmpregadoController();
			emp.setCpf("11111");
			emp.setNome("Maria da Silva");
			emp.setIdade(25);
			emp.setSalario(2500.0);
			System.out.println(controller.inserir(emp));
			
			
			Empregado emp = new Empregado();
			EmpregadoController controller = new EmpregadoController();
			emp.setCpf("11111");
			System.out.println(controller.excluir(emp));
			
			Connection con = ConnectionFactory.getConnection();
			if(con != null){
			System.out.println("OK");
			ConnectionFactory.close(con);
			}
			
			EmpregadoController controller = new EmpregadoController();
			List<Empregado> lista = controller .listarTodos();
			if(lista != null){
			for(Empregado e : lista){
			System.out.println("CPF: "+e.getCpf());
			System.out.println("Nome: "+e.getNome());
			System.out.println("Idade: "+e.getIdade());
			System.out.println("Salário: "+e.getSalario());
			}
			
			EmpregadoController controller = new EmpregadoController();
			Empregado emp = new Empregado();
			emp = controller.pesquisarPorCpf("11111");
			if (emp != null) {
			System.out.println("CPF: " + emp.getCpf());
			System.out.println("Nome: " + emp.getNome());
			System.out.println("Idade: " + emp.getIdade());
			System.out.println("Salário: " + emp.getSalario());
			}
			}
			
			}
			}
	
	
	}
}
