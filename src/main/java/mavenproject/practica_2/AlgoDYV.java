        private Datos divideYVenceras(int[] v){
            //Guardamos tiempo de comienzo:
            long t_comienzo = System.nanoTime();
            
            //Calculamos el nº de inversiones con DYV:
            int inversiones = calcularInversiones(v, 0, v.length-1);
            
            //Guardamos tiempo de finalizado:
            long t_final = System.nanoTime();
            
            //Devolvemos un objeto tipo Datos con el nº de inversiones y el tiempo tardado:
            Datos temp = new Datos(inversiones, (t_final - t_comienzo));
            return temp;
        }
        private int calcularInversiones(int [] v, int l, int r){
            if(l == r - 1){
                if(v[l]>v[r])return 1;
                else return 0;
            }else if(l == r){
                return 0;
            }else{
                int m = (r-l)/2;
                int sub1 = calcularInversiones(v, l, m);
                int sub2 = calcularInversiones(v, m+1, r); 
                int comb = combinar(v, l, m, r);
                return sub1 + sub2 + comb;
            }
        }
        private int combinar(int[] v, int l, int m, int r){
            int cont = 0;
            for(int i = l; i<=m; i++)
                for(int j = m+1; j<=r; j++)
                    if(v[i]>v[j])
                        cont++;
            return cont;
        }
