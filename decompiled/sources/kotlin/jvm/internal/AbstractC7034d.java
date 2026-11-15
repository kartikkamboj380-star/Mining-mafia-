package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7034d implements F8.b, Serializable {
    public static final Object NO_RECEIVER = a.f45979a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient F8.b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.d$a */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f45979a = new a();

        private a() {
        }
    }

    public AbstractC7034d() {
        this(NO_RECEIVER);
    }

    @Override // F8.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // F8.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public F8.b compute() {
        F8.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        F8.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract F8.b computeReflected();

    @Override // F8.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public F8.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? F.c(cls) : F.b(cls);
    }

    @Override // F8.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected F8.b getReflected() {
        F8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new p249y8.b();
    }

    @Override // F8.b
    public F8.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // F8.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // F8.b
    public F8.o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // F8.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // F8.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // F8.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // F8.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC7034d(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC7034d(Object obj, Class cls, String str, String str2, boolean z9) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z9;
    }
}
