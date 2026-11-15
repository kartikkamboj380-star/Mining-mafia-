package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6761t implements O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y f41287b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f41288a;

    /* JADX INFO: renamed from: com.google.protobuf.t$a */
    class a implements y {
        a() {
        }

        @Override // com.google.protobuf.y
        public x a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.y
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41289a;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            f41289a = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.t$c */
    private static class c implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y[] f41290a;

        c(y... yVarArr) {
            this.f41290a = yVarArr;
        }

        @Override // com.google.protobuf.y
        public x a(Class cls) {
            for (y yVar : this.f41290a) {
                if (yVar.b(cls)) {
                    return yVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.y
        public boolean b(Class cls) {
            for (y yVar : this.f41290a) {
                if (yVar.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C6761t() {
        this(c());
    }

    private static boolean b(x xVar) {
        return b.f41289a[xVar.getSyntax().ordinal()] != 1;
    }

    private static y c() {
        return new c(C6756n.c(), d());
    }

    private static y d() {
        try {
            return (y) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            return f41287b;
        }
    }

    private static N e(Class cls, x xVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return b(xVar) ? A.T(cls, xVar, E.b(), r.b(), P.L(), AbstractC6754l.b(), AbstractC6764w.b()) : A.T(cls, xVar, E.b(), r.b(), P.L(), null, AbstractC6764w.b());
        }
        return b(xVar) ? A.T(cls, xVar, E.a(), r.a(), P.K(), AbstractC6754l.a(), AbstractC6764w.a()) : A.T(cls, xVar, E.a(), r.a(), P.K(), null, AbstractC6764w.a());
    }

    @Override // com.google.protobuf.O
    public N a(Class cls) {
        P.H(cls);
        x xVarA = this.f41288a.a(cls);
        if (xVarA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? B.m(P.L(), AbstractC6754l.b(), xVarA.b()) : B.m(P.K(), AbstractC6754l.a(), xVarA.b());
        }
        return e(cls, xVarA);
    }

    private C6761t(y yVar) {
        this.f41288a = (y) Internal.checkNotNull(yVar, "messageInfoFactory");
    }
}
