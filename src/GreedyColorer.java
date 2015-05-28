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
    public int colores;
    public int G[][];
    public int resultado[][];

    public GreedyColorer(int G[][])
    {
        this.G = G;
        n = G.length;
    }

    //Este metodo llena la variable resultado que 
    //sera usada para mostrar el resultado del
    //algoritmo greedy
    public void llenarResultado(int result[])
    {
        resultado = new int[2][result.length];
        for (int i = 0; i < result.length; i++)
        {
            result[i]++;

            resultado[0][i] = i + 1;
            resultado[1][i] = result[i];
        }
        colores = max(result);
    }

    //Este metodo es el que implementa el algoritmo greedy para colorear el grafo
    public void colorear()
    {
        //La lista de los colores resultantes
        int[] resultado = new int[n];
        //n es la cantidad de vertices en el grafo

        //Se asigna el primer color al primer vertice
        resultado[0] = 0;

        //Se inicializan el resto de colores como no asignados
        for (int u = 1; u < n; u++)
        {
            resultado[u] = -1;  //-1 Representa sin asignar
        }
        
        //Una lista de booleanas que representan si el color
        //reprsentado por la posicion i se encuentra disponible para
        //colorear el vertice
        boolean[] colorDisponible = new boolean[n];
        
        //Se inicializa como disponibles todos los colores
        for (int cr = 0; cr < n; cr++)
        {
            colorDisponible[cr] = true;
        }

        //Este ciclo le asigna color al resto de vertices
        for (int u = 1; u < n; u++)
        {
            //Por cada vertice en el grafo...
            for (int i = 0; i < n; i++)
            {
                //Se evalua que el vertice sea adjacente al vertice
                //que buscamos asignarle un color
                //Además se verifica que si tenga un color asignado
                if (G[u][i] == 1 && resultado[i] != -1)
                {
                    //Si cumple las condiciones, significa que el color
                    //de este vertice no esta disponible
                    colorDisponible[resultado[i]] = false;
                }
            }
            //Se recorre entonces todos los colores hasta encontrar 
            //el primero disponible
            int cr;
            for (cr = 0; cr < n; cr++)
            {
                //Al encontrar un color disponible, se detiene el ciclo
                if (colorDisponible[cr] == true)
                {
                    break;
                }
            }

            //Se asigna al vertice el primer color disponible
            resultado[u] = cr; 

            //Se reinicia por default a que todos los colores estan disponibles
            for (int i = 0; i < G.length; i++)
            {
                if (G[u][i] == 1 && resultado[i] != -1)
                {
                    colorDisponible[i] = true;
                }
            }
        }
        
        //Cuando se recorren todos los vertices se retorna el resultado
        llenarResultado(resultado);
    }

    //Funcion que regresa el numero maximo
    //Es usada para determinar la cantidad de colores usados
    private int max(int[] result)
    {
        int max = 0;
        for (int num : result)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }
}
