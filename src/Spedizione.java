
public class Spedizione {

	public int numero_spedizione;
	String nome_destinatario;
	String luogo_destinatario;
	String nome_mittente;
	String luogo_mittente;
	float peso;
	int stato; 
	
	// Legge una spedizione "matrice"
	void leggiSpedizione(Spedizione matrice) 
	{/*
		printf("\n\t\t\t\t\t\t\t\tInserisci il numero spedizione: ");
		scanf("%d", &matrice->numero_spedizione);

		printf("\n\t\t\t\t\t\t\t\tInserisci il nome destinatario: ");
		scanf("%s", matrice->nome_destinatario);

		printf("\n\t\t\t\t\t\t\t\tInserisci il luogo destinatario: ");
		scanf("%s", matrice->luogo_destinatario);

		printf("\n\t\t\t\t\t\t\t\tInserisci il nome mittente: ");
		scanf("%s", matrice->nome_mittente);

		printf("\n\t\t\t\t\t\t\t\tInserisci il luogo mittente: ");
		scanf("%s", matrice->luogo_mittente);

		printf("\n\t\t\t\t\t\t\t\tInserisci il peso spedizione: ");
		scanf("%f", &matrice->peso);

		matrice->stato=0;

		printf("\n\n"); */
	}
	
	// cerca e torna la posizione del primo elemento >= chiave nell'array
	int cerca_pos(Spedizione tir[], int n, int chiave)
	{
		int i;
		i = 0;

		while(i<n)
		{
			if(tir[i].numero_spedizione < chiave)
				i++;
			else if(tir[i].numero_spedizione == chiave || tir[i].numero_spedizione > chiave)
				return i;
		}
		return i;
	}

	// sposta a destra di 1 posizione creando lo spazio per la montagna da inserire
	void crea_spazio(Spedizione tir[], int n, int indice)
	{
		int i;
		for(i = n-1; i >= indice; i--)
		tir[i+1] = tir[i];
	}

	// inserisce una spedizione "matrice" nell'array "tir"
	void inserisciSpedizione(Spedizione tir[], int n, Spedizione matrice)
	{
		int indice;
		String temp;
		leggiSpedizione(matrice);
		indice=cerca_pos(tir,n, matrice.numero_spedizione);
		crea_spazio(tir,n,indice);
		tir[indice]=matrice;
		(n)++;
	}

	// stampa una spedizione "matrice"
	void stampaSpedizione(Spedizione matrice)
	{
		/*printf("\n");
		printf("\t\t\t\t\t\t\t\t------------------------------------------");
		printf("\n\t\t\t\t\t\t\t\tNumero spedizione:\t [ %d ]", matrice.numero_spedizione);
		printf("\n\t\t\t\t\t\t\t\tNome mittente:\t\t [ %s ]", matrice.nome_mittente);
		printf("\n\t\t\t\t\t\t\t\tLuogo di partenza:\t [ %s ]", matrice.luogo_mittente);
		printf("\n\t\t\t\t\t\t\t\tNome destinatario:\t [ %s ]", matrice.nome_destinatario);
		printf("\n\t\t\t\t\t\t\t\tLuogo di arrivo:\t [ %s ]", matrice.luogo_destinatario);
		printf("\n\t\t\t\t\t\t\t\tPeso spedizione:\t [ %f ]", matrice.peso);
		if(matrice.stato == 0)
			printf("\n\t\t\t\t\t\t\t\tStato spedizione:\t [ NON CONSEGNATO ]");
		else if(matrice.stato == 1)
			printf("\n\t\t\t\t\t\t\t\tStato spedizione:\t [ DESTINATARIO ASSENTE 1^VOLTA ]");
		else if(matrice.stato == 2)
			printf("\n\t\t\t\t\t\t\t\tStato spedizione:\t [ DESTINATARIO ASSENTE 2^VOLTA, CONSEGNA ANNULLATA ]");
		printf("\n\t\t\t\t\t\t\t\t------------------------------------------");
		printf("\n\n");*/
	}

	// stampa tutte le spedizioni
	void stampaTir(Spedizione tir[], int n)
	{
		int i=0;

		while(i<n)
		{
			stampaSpedizione(tir[i]);
			i++;
		}
	}

	// effettua un tentativo di consegna
	int consegnaPacchi(Spedizione tir[], int n, Spedizione deposito[])
	{/*	
		int i=0;
		int j;
		int k=0;
		int temp;

		while(i<n)
		{
		
			printf("\t\t\t\t\t\t\t\tSpedizione numero: [ %d ]", tir[i].numero_spedizione);
			printf("\n\n\t\t\t\t\t\t\t\tDestinatario: \n\t\t\t\t\t\t\t\t1)Presente\n\t\t\t\t\t\t\t\t2)Assente");
			printf("\n\n\t\t\t\t\t\t\t\t[]Selezione: ");
			scanf("%d", &temp);
			printf("\n\n");

			if(temp == 1)
			{
		//		printf("\t\t\t\t\t\t\t\tSpedizione numero: [ %d ] EFFETTUATA.\n\n", tir[i].numero_spedizione);
				cancellaSpedizione(tir,n,tir[i].numero_spedizione);
			}
			else if(temp == 2)
			{
				deposito[k]=tir[i];
				k++;
		//		(tir[i].stato)++;
			}
			
			if(tir[i].stato == 2)	
			{
				j=cancellaSpedizione(tir,n,tir[i].numero_spedizione);
			//	if(j == 1)
			//		printf("\n\t\t\t\t\t\t\tSPEDIZIONE RISPEDITA AL MITTENTE, DESTINATARIO ASSENTE.\n\n");
			//	else
				
				//	printf("\n\t\t\t\t\t\t\t\t\nERROR 404");
			}
			i++;
		}*/

		return 0; //k 
	}

	// cerca una spedizione tramite "chiave" e torna la sua posizione nell'array o -1 se non la trova
	// ricerca binaria
	int cercaSpedizione(Spedizione tir[], int n, int chiave)
	{
	    int inf = 0, sup = n - 1;
	    
	    while (inf <= sup)
	    {
	       int med = (inf + sup)/ 2;
	       if (tir[med].numero_spedizione == chiave)
	          return med;
	       if (tir[med].numero_spedizione < chiave)
	          inf = med + 1;
	       else
	          sup = med - 1;
	    }
	    return -1;
	 }
	 	 
	// Cancella in base alla chiave, torna -1 se non cancella, 1 se cancella
	int cancellaSpedizione(Spedizione tir[], int n, int chiave)
	{
		int i, pos;

	 			if (cercaSpedizione(tir,n,chiave)==-1) 
	    			return -1;
	    		else
	    			pos=cercaSpedizione(tir,n,chiave);
	 	
			i = pos;
	 		while (i < ((n) - 1))
	 		{
	 			tir[i] = tir[i + 1];
	 			i++;
			}
			
			(n)--;
			return 1;
	}

}
