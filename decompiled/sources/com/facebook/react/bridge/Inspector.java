package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@p024c3.a
@Metadata
public final class Inspector {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final HybridData mHybridData;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Inspector instance() {
            return Inspector.instance();
        }

        @NotNull
        public final LocalConnection connect(int i10, @NotNull RemoteConnection remote) {
            Intrinsics.checkNotNullParameter(remote, "remote");
            try {
                LocalConnection localConnectionConnectNative = instance().connectNative(i10, remote);
                if (localConnectionConnectNative != null) {
                    return localConnectionConnectNative;
                }
                throw new IllegalStateException("Can't open failed connection");
            } catch (UnsatisfiedLinkError e10) {
                Z1.a.n("ReactNative", "Inspector doesn't work in open source yet", e10);
                throw new RuntimeException(e10);
            }
        }

        @NotNull
        public final List<Page> getPages() {
            try {
                return AbstractC7024j.Y(instance().getPagesNative());
            } catch (UnsatisfiedLinkError e10) {
                Z1.a.n("ReactNative", "Inspector doesn't work in open source yet", e10);
                return CollectionsKt.i();
            }
        }

        private Companion() {
        }
    }

    @p024c3.a
    @Metadata
    public static final class LocalConnection {

        @NotNull
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public final native void disconnect();

        public final native void sendMessage(@NotNull String str);
    }

    @p024c3.a
    @Metadata
    public static final class Page {
        private final int id;

        @NotNull
        private final String title;

        @NotNull
        private final String vm;

        private Page(int i10, String str, String str2) {
            this.id = i10;
            this.title = str;
            this.vm = str2;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getVM() {
            return this.vm;
        }

        @NotNull
        public String toString() {
            return "Page{id=" + this.id + ", title='" + this.title + "'}";
        }
    }

    @p024c3.a
    @Metadata
    public interface RemoteConnection {
        @p024c3.a
        void onDisconnect();

        @p024c3.a
        void onMessage(@NotNull String str);
    }

    static {
        BridgeSoLoader.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @NotNull
    public static final LocalConnection connect(int i10, @NotNull RemoteConnection remoteConnection) {
        return Companion.connect(i10, remoteConnection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native LocalConnection connectNative(int i10, RemoteConnection remoteConnection);

    @NotNull
    public static final List<Page> getPages() {
        return Companion.getPages();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native Page[] getPagesNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Inspector instance();
}
