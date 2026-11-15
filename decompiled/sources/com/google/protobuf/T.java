package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f41194a = 100;

    T() {
    }

    private final void l(Object obj, L l10, int i10) {
        while (l10.A() != Integer.MAX_VALUE && m(obj, l10, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, ByteString byteString);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, L l10, int i10) throws InvalidProtocolBufferException {
        int iK = l10.k();
        int tagFieldNumber = WireFormat.getTagFieldNumber(iK);
        int tagWireType = WireFormat.getTagWireType(iK);
        if (tagWireType == 0) {
            e(obj, tagFieldNumber, l10.H());
            return true;
        }
        if (tagWireType == 1) {
            b(obj, tagFieldNumber, l10.a());
            return true;
        }
        if (tagWireType == 2) {
            d(obj, tagFieldNumber, l10.o());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a(obj, tagFieldNumber, l10.u());
            return true;
        }
        Object objN = n();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i11 = i10 + 1;
        if (i11 >= f41194a) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        l(objN, l10, i11);
        if (iMakeTag != l10.k()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(obj, tagFieldNumber, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(L l10);

    abstract Object r(Object obj);

    abstract void s(Object obj, Writer writer);

    abstract void t(Object obj, Writer writer);
}
