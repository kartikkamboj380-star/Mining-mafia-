package a9;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p070h.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f7356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z9) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f7352a = class2ContextualFactory;
        this.f7353b = polyBase2Serializers;
        this.f7354c = polyBase2DefaultSerializerProvider;
        this.f7355d = polyBase2NamedSerializers;
        this.f7356e = polyBase2DefaultDeserializerProvider;
        this.f7357f = z9;
    }

    @Override // a9.b
    public T8.b a(F8.c kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        w.a(this.f7352a.get(kClass));
        return null;
    }
}
