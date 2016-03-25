package com.sprhib.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.object.livematches.LiveScore;
import com.sprhib.pojo.livematches.LiveMatches;
import com.sprhib.pojo.livematches.Match;
import com.sprhib.restclient.LiveMatchesClient;

@Controller
public class LinkController {
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		//return new ModelAndView("home");
	    ModelAndView modelAndView = getLiveScore();
	    return modelAndView;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView indexPage() {
		//return new ModelAndView("home");
	    ModelAndView modelAndView = getLiveScore();
        return modelAndView;
	}
	
	public static ModelAndView getLiveScore()
	{
	    ModelAndView modelAndView = new ModelAndView("dustyhome");
	    LiveMatches liveMatchesList = LiveMatchesClient.getLiveMatches();
	    Match[] mch = liveMatchesList.getMchdata().getMatch();
	    int numberofMatches = mch.length;
	    List<LiveScore> liveScoreList = new ArrayList<LiveScore>();
	    for(int i=0; i<numberofMatches;i++)
	    {
	        String id = mch[i].getId();
	        String srs = mch[i].getSrs();
	        String mchDesc = mch[i].getMchdesc();
	        String mnum = mch[i].getMnum();
	        String grnd = mch[i].getGrnd();
	        String vcity = mch[i].getVcity();
	        String vcountry = mch[i].getVcountry();
	        String mchState = mch[i].getMchdesc();
	        String status = mch[i].getState().getStatus();
	        String TW = mch[i].getState().getTw();
	        String decisn = mch[i].getState().getDecisn(); 
	        String sName1 = "";
            String r1 = "";
            String ovrs1 = "";
            String wkts1 = "";
            String sName2 = "";
            String r2 = "";
            String ovrs2 = "";
            String wkts2 = "";
	        if(mch[i].getMscr()!=null)
	        {
    	        sName1 = mch[i].getMscr().getBttm().getSname();
    	        r1 = mch[i].getMscr().getBttm().getInngs().getR();
    	        ovrs1 = mch[i].getMscr().getBttm().getInngs().getOvrs();
    	        wkts1 = mch[i].getMscr().getBttm().getInngs().getWkts();
    	        sName2 = mch[i].getMscr().getBlgtm().getSname();
                r2 = mch[i].getMscr().getBlgtm().getInngs().getR();
                ovrs2 = mch[i].getMscr().getBlgtm().getInngs().getOvrs();
                wkts2 = mch[i].getMscr().getBlgtm().getInngs().getWkts();
	        }
	        
	        LiveScore liveScore = new LiveScore(id, srs, mchDesc, mnum, grnd, vcity, vcountry, mchState, status, TW, decisn, sName1, r1, ovrs1, wkts1, sName2, r2, ovrs2, wkts2);
	        liveScoreList.add(liveScore);
	    }
	    
	    modelAndView.addObject("liveMatchesList", liveScoreList);
	    return modelAndView;
	}
}
