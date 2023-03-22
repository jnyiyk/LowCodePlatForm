package org.yiyk.service;

import org.yiyk.entity.PartyBO;

public interface PartyService {
    public PartyBO saveParty(PartyBO partyBO);
    public PartyBO getParty(Long id);
    public PartyBO getPartyByCode(String code);
    public Long deleteParty(Long id);
}
