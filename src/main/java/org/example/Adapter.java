package org.example;
// This class is an implementation of the USA_Plug interface for an Adapter
// The adapter makes it possible to use an American plug in a European socket.

public class Adapter implements USA_Plug{

        private Europe_Socket European_Socket;

        // Constructor
        public Adapter(Europe_Socket European_Socket) {
            this.European_Socket = European_Socket;
        }
        // Override of the insertPlug method from the USA_Plug interface
        @Override
        public void insertPlug() {
            System.out.println("Utilize an adapter in order for the USA Plug can fit into the European Socket");
            // Call the plugInserted method on the European_Socket object to simulate the plug insertion.
            European_Socket.plugInserted();
        }
}