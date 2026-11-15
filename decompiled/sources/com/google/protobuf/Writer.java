package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, List list, boolean z9);

    void B(int i10, float f10);

    void C(int i10);

    void D(int i10, List list, boolean z9);

    void E(int i10, int i11);

    void F(int i10, List list, boolean z9);

    void G(int i10, List list, boolean z9);

    void H(int i10, int i11);

    void I(int i10, List list);

    void J(int i10, List list, N n10);

    void K(int i10, Object obj, N n10);

    void L(int i10, ByteString byteString);

    void M(int i10, List list, N n10);

    void N(int i10, Object obj, N n10);

    void O(int i10, Object obj);

    void P(int i10, MapEntryLite.b bVar, Map map);

    void a(int i10, List list, boolean z9);

    void b(int i10, Object obj);

    void c(int i10, int i11);

    void d(int i10, List list);

    void e(int i10, String str);

    void f(int i10, long j10);

    void g(int i10, List list, boolean z9);

    void h(int i10, int i11);

    void i(int i10, long j10);

    void j(int i10, List list, boolean z9);

    void k(int i10, List list, boolean z9);

    void l(int i10, List list, boolean z9);

    void m(int i10, long j10);

    void n(int i10, List list, boolean z9);

    void o(int i10, int i11);

    void p(int i10, double d10);

    void q(int i10, List list, boolean z9);

    void r(int i10, List list, boolean z9);

    void s(int i10, long j10);

    FieldOrder t();

    void u(int i10, long j10);

    void v(int i10, boolean z9);

    void w(int i10, int i11);

    void x(int i10);

    void y(int i10, List list, boolean z9);

    void z(int i10, List list, boolean z9);
}
