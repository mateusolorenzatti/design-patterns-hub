package es2.DPs.Mediator;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Mediator.src.ChatRoom;
import es2.DPs.Mediator.src.ChatUser;
import es2.DPs.Mediator.src.IChatRoom;
import es2.DPs.Mediator.src.User;

public class DPMediator implements DesignPattern {
    @Override
    public String getName() {
        return "Mediator";
    }

    @Override
    public String getCategoria() {
        return Categorias.BEHAVIORAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Mediator estabelece um comportamento entre os objetos \n" +
                " onde há uma classe central a todos e essa classe coordena a \n" +
                " comunicação e fluxo. O uso desse mediador auxilia para evitar \n" +
                " problemas de dependências entre classes que se comuniquem diretamente.";
    }

    @Override
    public void runExample() {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom, "1", "Maria");
        User user2 = new ChatUser(chatroom, "2", "José");
        User user3 = new ChatUser(chatroom, "3", "João");
        User user4 = new ChatUser(chatroom, "4", "Ana");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
    }
}

