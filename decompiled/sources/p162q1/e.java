package p162q1;

import r9.C7108k;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final long a(InterfaceC7107j interfaceC7107j, C7108k c7108k, long j10, long j11) {
        if (c7108k.E() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte bI = c7108k.i(0);
        long jE = j11 - ((long) c7108k.E());
        long j12 = j10;
        while (j12 < jE) {
            InterfaceC7107j interfaceC7107j2 = interfaceC7107j;
            long jY = interfaceC7107j2.y(bI, j12, jE);
            if (jY == -1 || interfaceC7107j2.m0(jY, c7108k)) {
                return jY;
            }
            j12 = jY + 1;
            interfaceC7107j = interfaceC7107j2;
        }
        return -1L;
    }
}
