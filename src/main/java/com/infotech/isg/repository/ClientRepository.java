package com.infotech.isg.repository;

import com.infotech.isg.domain.Client;

/**
* repository for Client domain object.
*
* @author Sevak Gharibian
*/
public interface ClientRepository {
    public Client findByUsername(String username);
}
