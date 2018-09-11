package org.projet.libraryservice.consumer.impl;

import org.projet.libraryservice.consumer.contract.LivreDAO;
import org.projet.libraryservice.consumer.impl.rowmapper.LivreRowMapper;
import org.projet.libraryservice.model.Livre;

import java.util.List;

public class LivreDAOImpl extends AbstractDAO implements LivreDAO {

    public List<Livre> getLivres() {

        String vSQL = "SELECT * FROM livre ORDER BY titre";

        LivreRowMapper vRowMapper = new LivreRowMapper();

        List<Livre> vListLivres = getJdbcTemplate().query(vSQL, vRowMapper);

        return vListLivres;
    }
}