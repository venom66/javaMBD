/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bart
 */
@Local
public interface NewsItemFacadeLocal {

    void create(NewsItem newsItem);

    void edit(NewsItem newsItem);

    void remove(NewsItem newsItem);

    NewsItem find(Object id);

    List<NewsItem> findAll();

    List<NewsItem> findRange(int[] range);

    int count();
    
}
