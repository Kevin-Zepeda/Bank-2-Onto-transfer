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
public class Information implements AgentAction {
    private int type;
   private String accountId;

   public int getType() {
      return type;
   }

   public String getAccountId() {
      return accountId;
   }

   public void setType(int type) {
      this.type = type;
   }

   public void setAccountId(String accountId) {
      this.accountId = accountId;
   }
}
