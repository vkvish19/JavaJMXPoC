package com.vkvish19.javajmx;

public class Sport implements SportMBean
{
    private String playerName;
    
    @Override
    public void playSport(String clubName)
    {
        System.out.println(this.playerName + " playing sport for club: " + clubName);
    }
    
    @Override
    public String getPlayerName()
    {
        return playerName;
    }
    
    @Override
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
        System.out.println("Set playerName value to: " + playerName);
    }
}
