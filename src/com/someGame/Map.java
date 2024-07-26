package com.someGame;

public class Map 
{
	private char[][] map;
	
	public Map()
	{
		char[][] temp = {
				{'#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#'},
				{'#','#','#','#','#','#','#'}
		};
		
		map = temp;
	}

	public char[][] getMap() {
		return map;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}
	
	
}
