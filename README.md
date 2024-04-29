span .color{
background-color:light-blue;
}


Criba de Eratòstenes

Eratòstenes era un matemàtic grec i va desenvolupar el seu sedàs al voltant de l'any 200 a. C..
La idea consisteix a anar recorrent els números, i marcant els que no són cosins. Quan trobem un número sense marcar, marcarem tots els seus múltiples (majors a si mateix) com que no són cosins, ja que són múltiples d'aquest.
Per exemple:
Comencem en el 2, marquem tots els seus múltiples majors a si mateix(majors a 2)
<p>
  2 , 3 , <span class="color">4 </span class="color">, 5 ,<span  class="color">6 </span> , 7 , <span class="color">8 </span> , 9 ,<span class="color">10 </span> ,
  11 , <span class="color">12 </span> , 13 , <span class="color">14 </span> , 15 ,<span class="color">16 </span> , 17 , <span class="color">18 </span> , 19 , <span class="color">20 </span>
</p>

Ara recorrem aquesta llista i veiem que el primer és sense marcar i marquem els seus múltiples majors a si mateix(majors a 3) → els seus múltiples majors a si mateix són: 6,9,12,15,18 i marquem els que estan sense marcar 
<p>
  2 , 3 , <span class="color">4 </span class="color">, 5 ,<span  class="color">6 </span> , 7 , <span class="color">8 </span> ,  <span class="color">9 </span> ,<span class="color">10 </span> ,
  11 , <span class="color">12 </span> , 13 , <span class="color">14 </span> ,  <span class="color">15 </span> ,<span class="color">16 </span> , 17 , <span class="color">18 </span> , 19 , <span class="color">20 </span>
</p>

I així seguim fins a arribar al número desitjat.
