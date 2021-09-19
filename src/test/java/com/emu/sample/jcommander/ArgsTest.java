package com.emu.sample.jcommander;

import com.beust.jcommander.JCommander;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArgsTest {

    @Test
    void TestArgs() {

        Args args = new Args();
        String[] argv = { "-log", "2", "-groups", "unit,unit2" };
        JCommander.newBuilder()
                .addObject(args)
                .build()
                .parse(argv);

        Assertions.assertEquals(args.getVerbose().intValue(), 2);

        Assertions.assertEquals(args.getGroups(), "unit,unit2");

    }
}
