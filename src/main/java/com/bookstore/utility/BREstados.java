package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BREstados {
	
	public final static String BR = "BR";
	
	public final static Map<String, String> mapeamentoBR = new HashMap<String, String>() {
		{
			
            put("AC", "Acre");
            put("AL", "Alagoas");
            put("AP", "Amapá");
            put("AM", "Amazonas");
            put("BA", "Bahia");
            put("CE", "Ceará");
            put("DF", "Distrito Federal");
            put("ES", "Espírito Santo");
            put("GO", "Goiás");
            put("MA", "Maranhão");
            put("MT", "Mato Grosso");
            put("MS", "Mato Grosso do Sul");
            put("MG", "Minas Gerais");
            put("PA", "Pará");
            put("PB", "Paraíba");
            put("PR", "Paraná");
            put("PE", "Pernambuco");
            put("PI", "Piauí");
             put("RJ", "Rio de Janeiro");
            put("RN", "Rio Grande do Norte");
            put("RS", "Rio Grande do Sul");
            put("RO", "Rondônia");
            put("RR", "Roraima");
             put("SC", "Santa Catarina");
            put("SP", "São Paulo");
            put("SE", "Sergipe");
            put("TO", "Tocantins");
           
       
		}
	};
	
	public final static List<String> listaSiglaBR = new ArrayList<>(mapeamentoBR.keySet());
	public final static List<String> listaEstadosBR = new ArrayList<>(mapeamentoBR.values());

}
