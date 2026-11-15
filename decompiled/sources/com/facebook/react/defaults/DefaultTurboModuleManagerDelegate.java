package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.N;
import com.facebook.react.T;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DefaultTurboModuleManagerDelegate extends T {

    @NotNull
    private static final b Companion = new b(null);

    public static final class a extends T.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f14569c = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(Function1 function1, ReactApplicationContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CollectionsKt.d(function1.invoke(context));
        }

        public final a f(final Function1 provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f14569c.add(new Function1() { // from class: com.facebook.react.defaults.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultTurboModuleManagerDelegate.a.g(provider, (ReactApplicationContext) obj);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.T.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public DefaultTurboModuleManagerDelegate b(ReactApplicationContext context, List packages) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packages, "packages");
            List list = this.f14569c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.w(arrayList, (Iterable) ((Function1) it.next()).invoke(context));
            }
            return new DefaultTurboModuleManagerDelegate(context, packages, arrayList, null);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @p024c3.a
        @NotNull
        public final HybridData initHybrid(@NotNull List<Object> list) {
            return DefaultTurboModuleManagerDelegate.initHybrid(list);
        }

        private b() {
        }
    }

    static {
        f.a();
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }

    @p024c3.a
    @NotNull
    public static final native HybridData initHybrid(@NotNull List<Object> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @NotNull
    protected HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends N> list, List<Object> list2) {
        super(reactApplicationContext, list, Companion.initHybrid(list2));
    }
}
