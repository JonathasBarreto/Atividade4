package school.cesar.q3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Cont {
		
	private Set<Contabilidade> C = new HashSet<>();
		
	public void addContabilidade(Contabilidade a) {
		this.C.add(a);
	}
	public void despesasOrdenadasValor() {
		this.C.stream()
		.sorted(Comparator.comparing(Contabilidade::getValor))
		.forEach(System.out::println);
		System.out.println();
	}
	
	public void despesasOrdenadasNome() {
		this.C.stream()
		.sorted(Comparator.comparing(Contabilidade::getNome))
		.forEach(System.out::println);
		System.out.println();
	}
	public void despesasOrdenadasData() {
		this.C.stream()
		.sorted(Comparator.comparing(Contabilidade::getData))
		.forEach(System.out::println);
		System.out.println();
	}
	
	public void imprimirMaiorDespesa() {
		System.out.println(this.C.stream().max(Comparator.comparing(Contabilidade::getValor)).get());
		System.out.println();
	}
	
	public void imprimirMenorDespesa() {
		System.out.println(this.C.stream().min((a1,a2) -> a1.getValor().compareTo(a2.getValor())).get());
		System.out.println();
	}
	
	public void imprimirMedia() {
		System.out.println("média " + this.C.stream().mapToDouble(a -> a.getValor()).average().getAsDouble());
		System.out.println();
	}
	
	public void imprimirSoma() {
		System.out.println("soma " + this.C.stream().mapToDouble(a -> a.getValor()).sum());
		System.out.println();
	}
	
	public void imprimirProdutoNotas() {
		System.out.println("produto " + this.C.stream().mapToDouble(a -> a.getValor()).reduce((a1,a2) -> a1*a2).getAsDouble());
		System.out.println();
	}
	
	public void imprimirDespesasMP(int valor) {
		this.C.stream().filter(a -> {
			return a.getValor() > valor;
		}).forEach(System.out::println);
		System.out.println();
	}
	
	public Map<String, Double> getMapaContabilidade() {
		return this.C.stream().collect(Collectors.toMap(Contabilidade::getNome, Contabilidade::getValor));
	}
	
	public static void main(String[] args) {
		Cont t = new Cont();
		
		Contabilidade aluno1 = new Contabilidade ("ddd", 12, "22");
		Contabilidade aluno2 = new Contabilidade ("ccc", 45, "11");
		Contabilidade aluno3 = new Contabilidade ("bbb", 89, "33");
		Contabilidade aluno4 = new Contabilidade ("aaa", 12, "44");
		
		t.addContabilidade(aluno1);
		t.addContabilidade(aluno2);
		t.addContabilidade(aluno3);
		t.addContabilidade(aluno4);
		
		t.despesasOrdenadasValor();
		t.despesasOrdenadasNome();
		t.imprimirMaiorDespesa();
		t.imprimirMenorDespesa();
		
		t.imprimirMedia();
		t.imprimirSoma();
		t.imprimirDespesasMP(0);
		
		t.despesasOrdenadasData();
		t.imprimirListaNomes();
		
		
		Map<String, Double> C = t.getMapaContabilidade();
		System.out.println(C);
	}

}
