import java.util.Locale;
import java.util.Scanner;
import curso_programacao.classe;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Product;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de pessoas");
		int n = sc.nextInt();
		
		Pessoa[] array = new Pessoa[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o tipo");
			char type = sc.next().charAt(0);		
			if (type == 'f') {
				System.out.println("Digite o nome");
				String nome = sc.next();
				System.out.println("Digite renda anual");
				int rendaAnual = sc.nextInt();
				System.out.println("Digite o gasto com  saúde");
				int gastoSaude = sc.nextInt();
				array[i] = new PessoaFisica(nome, rendaAnual, gastoSaude);
			}
			
			if (type == 'j') {
				System.out.println("Digite o nome");
				String nome = sc.next();
				System.out.println("Digite renda anual");
				int rendaAnual = sc.nextInt();
				System.out.println("Digite o número de funcionários");
				int numeroFuncionarios = sc.nextInt();
				array[i] = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				
			}
				
			}
			
		for (int i=0; i<n; i++) {
	

			System.out.println(array[i].mostrar());

			

				
			}

		
		
		sc.close();
}}