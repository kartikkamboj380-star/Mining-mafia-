package p132n1;

import com.google.protobuf.CodedOutputStream;
import p012b1.l;
import p012b1.m;
import p142o1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l.c f46635a = new l.c(p142o1.g.a(CodedOutputStream.DEFAULT_BUFFER_SIZE, CodedOutputStream.DEFAULT_BUFFER_SIZE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l.c f46636b = new l.c(Boolean.FALSE);

    public static final boolean a(o oVar) {
        return ((Boolean) m.b(oVar, f46636b)).booleanValue();
    }

    public static final f b(f fVar) {
        return (f) m.a(fVar, f46635a);
    }

    public static final f c(o oVar) {
        return (f) m.b(oVar, f46635a);
    }
}
