package org.projet.libraryservice.business.contract;

import org.projet.libraryservice.model.Livre;

import java.util.List;

public interface LivreManager {

    List<Livre> getLivres();
    
    List<Livre> getSearchLivre(String titre);
    
    List<Livre> getLivresDispo(boolean livredispo);
        
    void update(Livre livre);
    
    Livre getLivre(int id);
}