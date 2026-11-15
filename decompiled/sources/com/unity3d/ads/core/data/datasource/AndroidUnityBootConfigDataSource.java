package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;
import p229w8.c;
import p229w8.o;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {

    @NotNull
    private final Context context;

    public AndroidUnityBootConfigDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    @Nullable
    public String getValue(@NotNull String key) {
        Object objB;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            m.a aVar = m.f46450b;
            String str = key + '=';
            E e10 = new E();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                Intrinsics.checkNotNullExpressionValue(stream, "stream");
                o.d(new BufferedReader(new InputStreamReader(stream, Charsets.UTF_8), 8192), new AndroidUnityBootConfigDataSource$getValue$1$1$1(str, e10));
                Unit unit = Unit.f45918a;
                c.a(stream, null);
                objB = m.b((String) e10.f45973a);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(stream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th3));
        }
        return (String) (m.f(objB) ? null : objB);
    }
}
