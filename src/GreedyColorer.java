/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PabloJavier
 */
public class GreedyColorer {

    public int n;
    public int G[][];

    public GreedyColorer(int G[][]){
        this.G = G;
        n = G.length;
    }
    
    public void mostrarResultado(int result[]){
        for(int i = 0; i < result.length; i++){
            System.out.println("Vertice " + i + ":  " + result[i]);
        }
    }
    
    public void colorear()
    {
        int result[] = new int[n];
 
    // Assign the first color to first vertex
            result[0] = 0;

        // Initialize remaining V-1 vertices as unassigned
        for (int u = 1; u < n; u++)
        {
            result[u] = -1;  // no color is assigned to u
        }
    // A temporary array to store the available colors. True
        // value of available[cr] would mean that the color cr is
        // assigned to one of its adjacent vertices
        boolean available[] = new boolean[n];
        for (int cr = 0; cr < n; cr++)
        {
            available[cr] = false;
        }

        // Assign colors to remaining V-1 vertices
        for (int u = 1; u < n; u++)
        {
            // Process all adjacent vertices and flag their colors
            // as unavailable
            for(int i =0; i < G.length; i++){
                if(G[u][i] == 1 && result[i] != -1){
                    available[result[i]] = true;
                }
            }
            // Find the first available color
            int cr;
            for (cr = 0; cr < n; cr++)
            {
                if (available[cr] == false)
                {
                    break;
                }
            }

            result[u] = cr; // Assign the found color

            // Reset the values back to false for the next iteration
            for(int i =0; i < G.length; i++){
                if(G[u][i] == 1 && result[i] != -1){
                    available[i] = false;
                }
            }
        }
        mostrarResultado(result);
    }
}
