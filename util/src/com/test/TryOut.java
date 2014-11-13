package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TryOut {

	public static void main(String[] args){
		File fileVids = new File("C:\\Users\\jchaudhari\\Desktop\\am_vids.txt");
//		File fileGames = new File("C:\\Users\\jchaudhari\\Desktop\\am_games.txt");
		Map<String, Integer> vidsMap = new HashMap<String, Integer>();
//		Map<String, Integer> gamesMap = new HashMap<String, Integer>();
		System.out.println(fileVids.exists());
//		System.out.println(fileGames.exists());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("date:"+sdf.format(date));
		System.out.println("date:"+date.getDate());
		try {
			
			// Read Games
			BufferedReader br = new BufferedReader(new FileReader(fileVids));
			String line = null;
			Integer sum = 0;
			while((line=br.readLine())!=null) {
//				gamesMap.put(line, (gamesMap.get(line)==null)?1:gamesMap.get(line)+1);
				sum += Integer.parseInt(line);
			}
			System.out.println(sum);
			// Read Videos
//			br = new BufferedReader(new FileReader(fileVids));
//			line = null;
//			while((line=br.readLine())!=null) {
//				vidsMap.put(line, (vidsMap.get(line)==null)?1:vidsMap.get(line)+1);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(vidsMap.size()+": "+vidsMap.keySet());
//		System.out.println(gamesMap.size()+": "+gamesMap.keySet());
//		for(String k:vidsMap.keySet()) {
//			if(!gamesMap.containsKey(k)){
//				System.out.println("games does not contain videos locale "+ k);
//			}
//		}
//		for(String k:gamesMap.keySet()) {
//			if(!vidsMap.containsKey(k)){
//				System.out.println("videos does not contain games locale "+ k);
//			}
//		}

	}
	/*
	 es_MX
en_CL
es_PE
fr_CA
es_CL
en_CO
en_CA
en_BR
es_CO
pt_BR
en_MX
en_AR
en_US
es_AR
en_PE
en_US
es_AR
en_PE
es_MX
en_CL
es_PE
fr_CA
es_CL
en_CO
en_CA
en_BR
es_CO
pt_BR
en_MX
en_AR
en_MX
en_AR
en_US
es_AR
en_PE
es_MX
en_CL
es_PE
fr_CA
es_CL
en_CO
en_CA
en_BR
es_CO
pt_BR
en_US
en_CA
fr_CA
en_MX
es_MX
en_BR
pt_BR
en_CL
es_CL
en_AR
es_AR
en_US
en_CA
fr_CA
en_MX
es_MX
en_BR
pt_BR
en_CL
es_CL
en_AR
es_AR
en_US
en_CA
fr_CA
en_MX
es_MX
en_BR
pt_BR
en_CL
es_CL
en_AR
es_AR
en_CO
es_CO
en_PE
es_PE
en_CO
es_CO
en_PE
es_PE
en_CO
es_CO
en_PE
es_PE
	 */
}
