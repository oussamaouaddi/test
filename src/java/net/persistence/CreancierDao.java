/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.persistence;

import java.util.List;
import net.vo.Creancier;

/**
 *
 * @author brahim
 */
public interface CreancierDao {
    
    public List getAllCreanciers();
    public Creancier getCreancier(Integer id);
    public void update(Creancier creancier);
    public void insert(Creancier creancier);
    public void delete(Integer id);

}
