import java.util.Map;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manjukl
 */
public class MainClass
{
    public static final OrderingSystem orderSystem = new OrderingSystem(); 
    public static void main(String[] args)
    {
        MenuScreen menu = new MenuScreen();
        menu.main(null);
        
    }
}
