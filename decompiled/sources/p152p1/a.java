package p152p1;

import p022c1.C1206l;
import p162q1.e;
import r9.C7108k;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C7108k f47738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C7108k f47739b;

    static {
        C7108k.a aVar = C7108k.f48467d;
        f47738a = aVar.g("<svg");
        f47739b = aVar.g("<");
    }

    public static final boolean a(C1206l c1206l, InterfaceC7107j interfaceC7107j) {
        return interfaceC7107j.m0(0L, f47739b) && e.a(interfaceC7107j, f47738a, 0L, 1024L) != -1;
    }
}
