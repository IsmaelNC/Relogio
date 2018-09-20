package br.com.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hora {
	 
    public static String horaAtualizada() {
        return new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss").format(new Date());
    }
}
