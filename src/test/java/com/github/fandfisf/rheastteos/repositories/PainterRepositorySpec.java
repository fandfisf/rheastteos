package com.github.fandfisf.rheastteos.repositories;

import com.github.fandfisf.rheastteos.RheastteosApplication;
import com.github.fandfisf.rheastteos.model.Painter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RheastteosApplication.class)
@WebAppConfiguration
public class PainterRepositorySpec {
    @Autowired  private PainterRepository target = null;
    @Test
    public void yellowCanary(){
        assertNotNull(target);
    }
    @Test
    public void pullOneById(){
        final Painter vvg = target.findOne(1L);
        assertNotNull(vvg);
        assertEquals(vvg.getPseudonym(),"The Little Painter Fellow");
    }
    @Test
    public void pullByPseudonym(){
        final Painter sp = target.findAllByPseudonym("Pre-historic San People").get(0);
        assertNotNull(sp);
        assertEquals(sp.getFirstName(),"San");
    }
    @Test
    public void pullByLastName(){
        final Painter sp = target.findAllByLastName("van Gogh").get(0);
        assertNotNull(sp);
        assertEquals(sp.getFirstName(),"Vincent");
    }
}
