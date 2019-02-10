/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bart
 */
@Stateless
public class NewsItemFacade extends AbstractFacade<NewsItem> implements NewsItemFacadeLocal {

    @PersistenceContext(unitName = "MDBLab-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NewsItemFacade() {
        super(NewsItem.class);
    }
    
}
