package com.facebook.react.bridge;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public final class ReactMarker {

    @NotNull
    public static final ReactMarker INSTANCE = new ReactMarker();

    @NotNull
    private static final Queue<ReactMarkerRecord> nativeReactMarkerQueue = new ConcurrentLinkedQueue();

    @NotNull
    private static final List<MarkerListener> listeners = new CopyOnWriteArrayList();

    @NotNull
    private static final List<FabricMarkerListener> fabricMarkerListeners = new CopyOnWriteArrayList();

    @Metadata
    public interface FabricMarkerListener {
        void logFabricMarker(@NotNull ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i10, long j10);

        default void logFabricMarker(@NotNull ReactMarkerConstants name, @Nullable String str, int i10, long j10, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            logFabricMarker(name, str, i10, j10);
        }
    }

    @Metadata
    public interface MarkerListener {
        void logMarker(@NotNull ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i10);
    }

    @Metadata
    private static final class ReactMarkerRecord {

        @NotNull
        private final String markerName;
        private final long markerTime;

        public ReactMarkerRecord(@NotNull String markerName, long j10) {
            Intrinsics.checkNotNullParameter(markerName, "markerName");
            this.markerName = markerName;
            this.markerTime = j10;
        }

        @NotNull
        public final String getMarkerName() {
            return this.markerName;
        }

        public final long getMarkerTime() {
            return this.markerTime;
        }
    }

    private ReactMarker() {
    }

    @p024c3.a
    public static final void addFabricListener(@NotNull FabricMarkerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<FabricMarkerListener> list = fabricMarkerListeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @p024c3.a
    public static final void addListener(@NotNull MarkerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<MarkerListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @p024c3.a
    public static final void clearFabricMarkerListeners() {
        fabricMarkerListeners.clear();
    }

    @p024c3.a
    public static final void clearMarkerListeners() {
        listeners.clear();
    }

    @p024c3.a
    public static final void logFabricMarker(@NotNull ReactMarkerConstants name, @Nullable String str, int i10, long j10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<FabricMarkerListener> it = fabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(name, str, i10, j10, i11);
        }
    }

    @p024c3.a
    public static final void logMarker(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, (String) null);
    }

    @p024c3.a
    private static final native void nativeLogMarker(String str, long j10);

    @p024c3.a
    private static final void notifyNativeMarker(ReactMarkerConstants reactMarkerConstants, Long l10) {
        if (!reactMarkerConstants.hasMatchingNameMarker()) {
            return;
        }
        long jLongValue = l10 != null ? l10.longValue() : SystemClock.uptimeMillis();
        if (!ReactNativeJniCommonSoLoader.isInitialized()) {
            nativeReactMarkerQueue.add(new ReactMarkerRecord(reactMarkerConstants.name(), jLongValue));
            return;
        }
        nativeLogMarker(reactMarkerConstants.name(), jLongValue);
        while (true) {
            ReactMarkerRecord reactMarkerRecordPoll = nativeReactMarkerQueue.poll();
            if (reactMarkerRecordPoll == null) {
                return;
            } else {
                nativeLogMarker(reactMarkerRecordPoll.getMarkerName(), reactMarkerRecordPoll.getMarkerTime());
            }
        }
    }

    @p024c3.a
    public static final void removeFabricListener(@NotNull FabricMarkerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        fabricMarkerListeners.remove(listener);
    }

    @p024c3.a
    public static final void removeListener(@NotNull MarkerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    @p024c3.a
    public static final void logMarker(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, (String) null, i10);
    }

    @p024c3.a
    public static final void logFabricMarker(@NotNull ReactMarkerConstants name, @Nullable String str, int i10, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<FabricMarkerListener> it = fabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(name, str, i10, j10, 0);
        }
    }

    @p024c3.a
    public static final void logMarker(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, str, 0);
    }

    @p024c3.a
    public static final void logMarker(@NotNull String name, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(ReactMarkerConstants.valueOf(name), str, i10);
    }

    @p024c3.a
    public static final void logFabricMarker(@NotNull ReactMarkerConstants name, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logFabricMarker(name, str, i10, SystemClock.uptimeMillis(), 0);
    }

    @p024c3.a
    public static final void logMarker(@NotNull ReactMarkerConstants name) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, (String) null, 0);
    }

    @p024c3.a
    public static final void logMarker(@NotNull ReactMarkerConstants name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, (String) null, i10);
    }

    @p024c3.a
    public static final void logMarker(@NotNull ReactMarkerConstants name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, str, 0);
    }

    @p024c3.a
    public static final void logMarker(@NotNull ReactMarkerConstants name, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, null, 0, Long.valueOf(j10));
    }

    @p024c3.a
    public static final void logMarker(@NotNull ReactMarkerConstants name, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logMarker(name, str, i10, null);
    }

    @p024c3.a
    public static final void logMarker(@NotNull ReactMarkerConstants name, @Nullable String str, int i10, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(name, "name");
        logFabricMarker(name, str, i10);
        Iterator<MarkerListener> it = listeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(name, str, i10);
        }
        notifyNativeMarker(name, l10);
    }
}
