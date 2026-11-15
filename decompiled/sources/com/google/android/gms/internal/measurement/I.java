package com.google.android.gms.internal.measurement;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC6351w {
    protected I() {
        this.f36930a.add(M.FOR_IN);
        this.f36930a.add(M.FOR_IN_CONST);
        this.f36930a.add(M.FOR_IN_LET);
        this.f36930a.add(M.FOR_LET);
        this.f36930a.add(M.FOR_OF);
        this.f36930a.add(M.FOR_OF_CONST);
        this.f36930a.add(M.FOR_OF_LET);
        this.f36930a.add(M.WHILE);
    }

    private static InterfaceC6289p c(G g10, InterfaceC6289p interfaceC6289p, InterfaceC6289p interfaceC6289p2) {
        return e(g10, interfaceC6289p.b(), interfaceC6289p2);
    }

    private static InterfaceC6289p d(G g10, InterfaceC6289p interfaceC6289p, InterfaceC6289p interfaceC6289p2) {
        if (interfaceC6289p instanceof Iterable) {
            return e(g10, ((Iterable) interfaceC6289p).iterator(), interfaceC6289p2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static InterfaceC6289p e(G g10, Iterator it, InterfaceC6289p interfaceC6289p) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC6289p interfaceC6289pB = g10.a((InterfaceC6289p) it.next()).b((C6199f) interfaceC6289p);
                if (interfaceC6289pB instanceof C6217h) {
                    C6217h c6217h = (C6217h) interfaceC6289pB;
                    if ("break".equals(c6217h.c())) {
                        return InterfaceC6289p.f36808x;
                    }
                    if ("return".equals(c6217h.c())) {
                        return c6217h;
                    }
                }
            }
        }
        return InterfaceC6289p.f36808x;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        M m10 = M.ADD;
        int iOrdinal = B2.e(str).ordinal();
        if (iOrdinal == 65) {
            B2.a(M.WHILE.name(), 4, list);
            InterfaceC6289p interfaceC6289p = (InterfaceC6289p) list.get(0);
            InterfaceC6289p interfaceC6289p2 = (InterfaceC6289p) list.get(1);
            InterfaceC6289p interfaceC6289p3 = (InterfaceC6289p) list.get(2);
            InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(3));
            if (c6157a2.a(interfaceC6289p3).zze().booleanValue()) {
                InterfaceC6289p interfaceC6289pB = c6157a2.b((C6199f) interfaceC6289pA);
                if (interfaceC6289pB instanceof C6217h) {
                    C6217h c6217h = (C6217h) interfaceC6289pB;
                    if ("break".equals(c6217h.c())) {
                        return InterfaceC6289p.f36808x;
                    }
                    if ("return".equals(c6217h.c())) {
                        return c6217h;
                    }
                }
            }
            while (c6157a2.a(interfaceC6289p).zze().booleanValue()) {
                InterfaceC6289p interfaceC6289pB2 = c6157a2.b((C6199f) interfaceC6289pA);
                if (interfaceC6289pB2 instanceof C6217h) {
                    C6217h c6217h2 = (C6217h) interfaceC6289pB2;
                    if ("break".equals(c6217h2.c())) {
                        return InterfaceC6289p.f36808x;
                    }
                    if ("return".equals(c6217h2.c())) {
                        return c6217h2;
                    }
                }
                c6157a2.a(interfaceC6289p2);
            }
            return InterfaceC6289p.f36808x;
        }
        switch (iOrdinal) {
            case 26:
                B2.a(M.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C6324t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new H(c6157a2, ((InterfaceC6289p) list.get(0)).zzc()), c6157a2.a((InterfaceC6289p) list.get(1)), c6157a2.a((InterfaceC6289p) list.get(2)));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                B2.a(M.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C6324t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new E(c6157a2, ((InterfaceC6289p) list.get(0)).zzc()), c6157a2.a((InterfaceC6289p) list.get(1)), c6157a2.a((InterfaceC6289p) list.get(2)));
            case 28:
                B2.a(M.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C6324t)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new F(c6157a2, ((InterfaceC6289p) list.get(0)).zzc()), c6157a2.a((InterfaceC6289p) list.get(1)), c6157a2.a((InterfaceC6289p) list.get(2)));
            case 29:
                B2.a(M.FOR_LET.name(), 4, list);
                InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(0));
                if (!(interfaceC6289pA2 instanceof C6199f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C6199f c6199f = (C6199f) interfaceC6289pA2;
                InterfaceC6289p interfaceC6289p4 = (InterfaceC6289p) list.get(1);
                InterfaceC6289p interfaceC6289p5 = (InterfaceC6289p) list.get(2);
                InterfaceC6289p interfaceC6289pA3 = c6157a2.a((InterfaceC6289p) list.get(3));
                C6157a2 c6157a2C = c6157a2.c();
                for (int i10 = 0; i10 < c6199f.l(); i10++) {
                    String strZzc = c6199f.o(i10).zzc();
                    c6157a2C.e(strZzc, c6157a2.h(strZzc));
                }
                while (c6157a2.a(interfaceC6289p4).zze().booleanValue()) {
                    InterfaceC6289p interfaceC6289pB3 = c6157a2.b((C6199f) interfaceC6289pA3);
                    if (interfaceC6289pB3 instanceof C6217h) {
                        C6217h c6217h3 = (C6217h) interfaceC6289pB3;
                        if ("break".equals(c6217h3.c())) {
                            return InterfaceC6289p.f36808x;
                        }
                        if ("return".equals(c6217h3.c())) {
                            return c6217h3;
                        }
                    }
                    C6157a2 c6157a2C2 = c6157a2.c();
                    for (int i11 = 0; i11 < c6199f.l(); i11++) {
                        String strZzc2 = c6199f.o(i11).zzc();
                        c6157a2C2.e(strZzc2, c6157a2C.h(strZzc2));
                    }
                    c6157a2C2.a(interfaceC6289p5);
                    c6157a2C = c6157a2C2;
                }
                return InterfaceC6289p.f36808x;
            case 30:
                B2.a(M.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C6324t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new H(c6157a2, ((InterfaceC6289p) list.get(0)).zzc()), c6157a2.a((InterfaceC6289p) list.get(1)), c6157a2.a((InterfaceC6289p) list.get(2)));
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                B2.a(M.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C6324t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new E(c6157a2, ((InterfaceC6289p) list.get(0)).zzc()), c6157a2.a((InterfaceC6289p) list.get(1)), c6157a2.a((InterfaceC6289p) list.get(2)));
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                B2.a(M.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C6324t)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new F(c6157a2, ((InterfaceC6289p) list.get(0)).zzc()), c6157a2.a((InterfaceC6289p) list.get(1)), c6157a2.a((InterfaceC6289p) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
