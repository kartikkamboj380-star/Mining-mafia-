package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034d3.B;

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
public final class EventAnimationDriver implements RCTModernEventEmitter {

    @NotNull
    public String eventName;

    @NotNull
    private final List<String> eventPath;

    @NotNull
    public B valueNode;
    public int viewTag;

    public EventAnimationDriver(@NotNull String eventName, int i10, @NotNull List<String> eventPath, @NotNull B valueNode) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventPath, "eventPath");
        Intrinsics.checkNotNullParameter(valueNode, "valueNode");
        this.eventName = eventName;
        this.viewTag = i10;
        this.eventPath = eventPath;
        this.valueNode = valueNode;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i10, @NotNull String eventName, @Nullable WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(-1, i10, eventName, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(@NotNull String eventName, @NotNull WritableArray touches, @NotNull WritableArray changedIndices) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(touches, "touches");
        Intrinsics.checkNotNullParameter(changedIndices, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i10, int i11, @NotNull String eventName, @Nullable WritableMap writableMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        receiveEvent(i10, i11, eventName, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i10, int i11, @NotNull String eventName, boolean z9, int i12, @Nullable WritableMap writableMap, int i13) {
        ReadableMap readableMap;
        ReadableType type;
        ReadableMap map;
        ReadableMap readableMap2;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (writableMap != null) {
            int size = this.eventPath.size() - 1;
            int i14 = 0;
            ReadableArray array = null;
            while (i14 < size) {
                if (readableMap != null) {
                    String str = this.eventPath.get(i14);
                    ReadableType type2 = readableMap.getType(str);
                    if (type2 == ReadableType.Map) {
                        readableMap = writableMap;
                        map = readableMap.getMap(str);
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type2 != ReadableType.Array) {
                            readableMap = writableMap;
                            throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for key '" + str + "'");
                        }
                        readableMap = writableMap;
                        array = readableMap.getArray(str);
                        readableMap2 = null;
                    }
                } else {
                    int i15 = Integer.parseInt(this.eventPath.get(i14));
                    if (array != null) {
                        readableMap = writableMap;
                        type = array.getType(i15);
                    } else {
                        readableMap = writableMap;
                        type = null;
                    }
                    if (type == ReadableType.Map) {
                        map = array.getMap(i15);
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type + " for index '" + i15 + "'");
                        }
                        array = array.getArray(i15);
                        readableMap2 = null;
                    }
                }
                i14++;
                readableMap = readableMap2;
            }
            readableMap = writableMap;
            List<String> list = this.eventPath;
            String str2 = list.get(list.size() - 1);
            if (readableMap != null) {
                this.valueNode.f42947f = readableMap.getDouble(str2);
                return;
            }
            this.valueNode.f42947f = array != null ? array.getDouble(Integer.parseInt(str2)) : 0.0d;
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}
