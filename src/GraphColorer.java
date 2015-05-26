/*
 * Autor: Nirupam Das
 * Obtenido de: http://javaingrab.blogspot.com/2012/12/m-way-graph-coloring-with-backtracking.html
 * Modificado del orignal
 */

/**
 *
 * @author PabloJavier
 */
public class GraphColorer {

    public int G[][]; //G is graph's adjacency matrix 
    public int x[]; //Solution vector
    public int n, m;
    
    public String resultado;
    public boolean encontrado;

    public void mColoring(int k)
    {  //backtracking function
        for (int i = 1; i <= n; i++)
        {
            next_color(k);  //coloring kth vertex
            if (x[k] == 0)
            {
                return;  //if unsuccessful then backtrack
            }
            if (k == n)  //if all colored then show
            {
                write();
                encontrado = true;
                break;
            } 
            else
            {
                mColoring(k + 1);  /* successful but still left to color */
                if(encontrado){
                    break;
                }
            }
        }
    }
    
    private void next_color(int k)
    {
        while(true)
        {
            int i;
            x[k] = (x[k] + 1) % (m + 1);
            if (x[k] == 0)
            {
                return;
            }
            for (i = 1; i <= n; i++)
            {
                if (G[i][k] != 0 && x[k] == x[i])  /* checking adjacency and not same color */
                {
                    break;
                }
            }
            if (i == n + 1)
            {
                return;  //new color found
            }
        }
    }

    private void write()
    {
        resultado = "Backtracking: ";
        for (int i = 1; i <= n; i++)
        {
            resultado += "  (" + i + ", " + x[i] + ")";  //solution vector
        }
        resultado += "  Colores: "+m;
    }

    public void llenarGrafo(int grafo[][]){
        encontrado = false;
        n = grafo.length;
        G = new int[n + 1][n + 1];
        x = new int[n + 1];
        
        m = 1;
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                G[i][j] = grafo[i-1][j-1];
            }
        }
    }
    
    public void reiniciar(){
        m = m + 1;
        x =new int[n+1];
    }

}
