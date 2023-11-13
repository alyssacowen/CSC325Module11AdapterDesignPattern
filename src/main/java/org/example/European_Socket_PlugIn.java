package org.example;

public class European_Socket_PlugIn implements Europe_Socket {
    // Overrides method from Europe_Socket interface
    // This function specifies what happens when a plug is introduced into this European socket.
    @Override
    public void plugInserted()
    {
        System.out.println("Insertion of plug into European socket has occured");
    }
}
