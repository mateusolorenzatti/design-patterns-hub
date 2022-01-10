package es2.DPs.Flyweight.src;/*
Interface do jogador
Tanto CT como TR precisa ter uma missão e uma arma
*/

interface Player
{
    public void assignWeapon(String weapon);
    public void mission();
}
