package br.com.prog2.rh.controller;

public class EmpregadoController {

	
	import java.util.List;
	import br.com.prog2.rh.model.Empregado;
	import br.com.prog2.rh.persistencia.EmpregadoDAOImp;
	public class EmpregadoController {
	public String inserir(Empregado emp){
	EmpregadoDAOImp dao = new EmpregadoDAOImp();
	return dao.inserir(emp);
	}
	public String alterar(Empregado emp) {
	EmpregadoDAOImp dao = new EmpregadoDAOImp();
	return dao.alterar(emp);
	}
	public String excluir(Empregado emp){
	EmpregadoDAOImp dao = new EmpregadoDAOImp();
	return dao.excluir(emp);
	}
	public List<Empregado> listarTodos(){
	EmpregadoDAOImp dao = new EmpregadoDAOImp();
	return dao.listarTodos();
	public Empregado pesquisarPorCpf(String cpf){
		EmpregadoDAOImp dao = new EmpregadoDAOImp();
		return dao.pesquisarPorCpf(cpf);
		}
		}
	
	@Override
	public String inserir(Empregado emp){
	String sql = "insert into empregado(cpf,nome,idade,salario)
	values (?,?,?,?)";
	Connection con = ConnectionFactory.getConnection();
	try{
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setString(1, emp.getCpf());
	pst.setString(2, emp.getNome());
	pst.setInt(3, emp.getIdade());
	pst.setDouble(4, emp.getSalario());
	int res = pst.executeUpdate();
	if(res > 0){
	return "Inserido com sucesso.";
	}else{
	return "Erro ao inserir.";
	}
	}catch(SQLException e){
	return e.getMessage();
	}finally {
	ConnectionFactory.close(con);
	}
	}
	
	
	}
	
}
