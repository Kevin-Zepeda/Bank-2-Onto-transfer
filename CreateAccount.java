/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;
import jade.content.*;

/**
 *
 * @author kevin
 */
public class CreateAccount implements AgentAction {
    // ------------------------------------------------

   private String name;

   public String getName() {
     return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
