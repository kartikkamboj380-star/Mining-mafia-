package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;
import p169q8.b;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    @Metadata
    public static final class DefaultImpls {
        @NotNull
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(@NotNull BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public static <P extends BaseParams, R> Object m82invokegIAlus(@NotNull BaseTask<? super P, R> baseTask, @NotNull P p10, @NotNull b bVar) {
            BaseTask$invoke$1 baseTask$invoke$1;
            if (bVar instanceof BaseTask$invoke$1) {
                baseTask$invoke$1 = (BaseTask$invoke$1) bVar;
                int i10 = baseTask$invoke$1.label;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    baseTask$invoke$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
                } else {
                    baseTask$invoke$1 = new BaseTask$invoke$1(bVar);
                }
            } else {
                baseTask$invoke$1 = new BaseTask$invoke$1(bVar);
            }
            Object obj = baseTask$invoke$1.result;
            Object objE = p179r8.b.e();
            int i11 = baseTask$invoke$1.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return ((m) obj).i();
            }
            n.b(obj);
            baseTask$invoke$1.label = 1;
            Object objMo80doWorkgIAlus = baseTask.mo80doWorkgIAlus(p10, baseTask$invoke$1);
            return objMo80doWorkgIAlus == objE ? objE : objMo80doWorkgIAlus;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo80doWorkgIAlus(@NotNull P p10, @NotNull b bVar);

    @Nullable
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo81invokegIAlus(@NotNull P p10, @NotNull b bVar);
}
