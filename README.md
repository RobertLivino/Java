# Java
Repositorio usado para estudar os exercicios propostos na aula de POO na fatec americana

wiki do Perroti: https://pooperrotti.fandom.com/pt-br/wiki/Wiki_Programa%C3%A7%C3%A3o_Orientada_a_Objeto

Exemplos de exeção:
 
if(condição) {
   Exception exc;
   exc = new Exeption("msg");
   throw exc;
}

OU

if(condição) throw new Exeption("msg");

exceçoes podem ser verificadas(checked) ou não verificadas(unchecked). A classe Exception e suas classes descendentes(exeto a classe runtime) geram exceções verificadas. a classe RuntimeExeption e suas classes descendentes são exceções não verificadas.
Exceções verificadas não podem ser ignoradas e o método que as lança precisa ter um aviso em suas assinaturas. Alem disso, o método so pode ser chamado de dentro de um bloco try.


								|-----throwable-----|
							Exception			error
									|
								RuntimeExeption
								
Public void metodo()throws Exeption
{
	if(condição) throw new Exception("msg");
	try{
	-
	-
	-
	}
	catch{
	-
	-
	-
	}
}

	Novas classes de Exceção:
	
Para criar novas classes de exceção, basta criar descendentes de Exception(Verificadas) ou de RuntimeExeption(não verificadas) e reescrever o método toString() para retomar a msg desejada. Opcionalmente, podem ser construtores adicionais que recebam por parametro informações que serão acrecentadas na msg.

public class CPFInvalidoExc Extends Exception {
	private msg;
	
	//Construtor padrão
	public CPFInvalidoExc(){
		msg = "CPF Invalido!!!";		
	}
	
	//Construtor parametrizado
	public CPFInvalidoExc(String cpf){
		msg = "O CPF " + cpf + " é invalido!!!";		
	}
	
	public String toString(){
		return msg;
	}
}
