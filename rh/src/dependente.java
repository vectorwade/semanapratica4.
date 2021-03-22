
public class dependente {

	cpfEmpregado char(11) not null,
	nome varchar(50) not null,
	grauParentesco varchar(10),
	dataNascimento date,
	constraint pk_dependente primary key(cpfEmpregado, nome),
	constraint fk_empregado foreign key(cpfEmpregado) references
	Empregado(cpf),
};