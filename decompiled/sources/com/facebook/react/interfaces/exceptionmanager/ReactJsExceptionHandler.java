package com.facebook.react.interfaces.exceptionmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
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
@Metadata
public interface ReactJsExceptionHandler {

    @Metadata
    public interface ProcessedError {

        @Metadata
        public interface StackFrame {
            @Nullable
            Integer getColumn();

            @Nullable
            String getFile();

            @Nullable
            Integer getLineNumber();

            @NotNull
            String getMethodName();
        }

        @Nullable
        String getComponentStack();

        @NotNull
        ReadableMap getExtraData();

        int getId();

        @NotNull
        String getMessage();

        @Nullable
        String getName();

        @Nullable
        String getOriginalMessage();

        @NotNull
        List<StackFrame> getStack();

        boolean isFatal();
    }

    @Metadata
    private static final class ProcessedErrorImpl implements ProcessedError {

        @Nullable
        private final String componentStack;

        @NotNull
        private final ReadableNativeMap extraData;
        private final int id;
        private final boolean isFatal;

        @NotNull
        private final String message;

        @Nullable
        private final String name;

        @Nullable
        private final String originalMessage;

        @NotNull
        private final ArrayList<ProcessedErrorStackFrameImpl> stack;

        public ProcessedErrorImpl(@NotNull String message, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ArrayList<ProcessedErrorStackFrameImpl> stack, int i10, boolean z9, @NotNull ReadableNativeMap extraData) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stack, "stack");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            this.message = message;
            this.originalMessage = str;
            this.name = str2;
            this.componentStack = str3;
            this.stack = stack;
            this.id = i10;
            this.isFatal = z9;
            this.extraData = extraData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProcessedErrorImpl copy$default(ProcessedErrorImpl processedErrorImpl, String str, String str2, String str3, String str4, ArrayList arrayList, int i10, boolean z9, ReadableNativeMap readableNativeMap, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = processedErrorImpl.message;
            }
            if ((i11 & 2) != 0) {
                str2 = processedErrorImpl.originalMessage;
            }
            if ((i11 & 4) != 0) {
                str3 = processedErrorImpl.name;
            }
            if ((i11 & 8) != 0) {
                str4 = processedErrorImpl.componentStack;
            }
            if ((i11 & 16) != 0) {
                arrayList = processedErrorImpl.stack;
            }
            if ((i11 & 32) != 0) {
                i10 = processedErrorImpl.id;
            }
            if ((i11 & 64) != 0) {
                z9 = processedErrorImpl.isFatal;
            }
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                readableNativeMap = processedErrorImpl.extraData;
            }
            boolean z10 = z9;
            ReadableNativeMap readableNativeMap2 = readableNativeMap;
            ArrayList arrayList2 = arrayList;
            int i12 = i10;
            return processedErrorImpl.copy(str, str2, str3, str4, arrayList2, i12, z10, readableNativeMap2);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @Nullable
        public final String component2() {
            return this.originalMessage;
        }

        @Nullable
        public final String component3() {
            return this.name;
        }

        @Nullable
        public final String component4() {
            return this.componentStack;
        }

        @NotNull
        public final ArrayList<ProcessedErrorStackFrameImpl> component5() {
            return this.stack;
        }

        public final int component6() {
            return this.id;
        }

        public final boolean component7() {
            return this.isFatal;
        }

        @NotNull
        public final ReadableNativeMap component8() {
            return this.extraData;
        }

        @NotNull
        public final ProcessedErrorImpl copy(@NotNull String message, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ArrayList<ProcessedErrorStackFrameImpl> stack, int i10, boolean z9, @NotNull ReadableNativeMap extraData) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stack, "stack");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            return new ProcessedErrorImpl(message, str, str2, str3, stack, i10, z9, extraData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProcessedErrorImpl)) {
                return false;
            }
            ProcessedErrorImpl processedErrorImpl = (ProcessedErrorImpl) obj;
            return Intrinsics.b(this.message, processedErrorImpl.message) && Intrinsics.b(this.originalMessage, processedErrorImpl.originalMessage) && Intrinsics.b(this.name, processedErrorImpl.name) && Intrinsics.b(this.componentStack, processedErrorImpl.componentStack) && Intrinsics.b(this.stack, processedErrorImpl.stack) && this.id == processedErrorImpl.id && this.isFatal == processedErrorImpl.isFatal && Intrinsics.b(this.extraData, processedErrorImpl.extraData);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        @Nullable
        public String getComponentStack() {
            return this.componentStack;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        public int getId() {
            return this.id;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        @Nullable
        public String getName() {
            return this.name;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        @Nullable
        public String getOriginalMessage() {
            return this.originalMessage;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.originalMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.componentStack;
            return ((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.stack.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Boolean.hashCode(this.isFatal)) * 31) + this.extraData.hashCode();
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        public boolean isFatal() {
            return this.isFatal;
        }

        @NotNull
        public String toString() {
            return "ProcessedErrorImpl(message=" + this.message + ", originalMessage=" + this.originalMessage + ", name=" + this.name + ", componentStack=" + this.componentStack + ", stack=" + this.stack + ", id=" + this.id + ", isFatal=" + this.isFatal + ", extraData=" + this.extraData + ")";
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        @NotNull
        public ReadableNativeMap getExtraData() {
            return this.extraData;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError
        @NotNull
        public ArrayList<ProcessedErrorStackFrameImpl> getStack() {
            return this.stack;
        }
    }

    @Metadata
    private static final class ProcessedErrorStackFrameImpl implements ProcessedError.StackFrame {

        @Nullable
        private final Integer column;

        @Nullable
        private final String file;

        @Nullable
        private final Integer lineNumber;

        @NotNull
        private final String methodName;

        public ProcessedErrorStackFrameImpl(@Nullable String str, @NotNull String methodName, @Nullable Integer num, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.file = str;
            this.methodName = methodName;
            this.lineNumber = num;
            this.column = num2;
        }

        public static /* synthetic */ ProcessedErrorStackFrameImpl copy$default(ProcessedErrorStackFrameImpl processedErrorStackFrameImpl, String str, String str2, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = processedErrorStackFrameImpl.file;
            }
            if ((i10 & 2) != 0) {
                str2 = processedErrorStackFrameImpl.methodName;
            }
            if ((i10 & 4) != 0) {
                num = processedErrorStackFrameImpl.lineNumber;
            }
            if ((i10 & 8) != 0) {
                num2 = processedErrorStackFrameImpl.column;
            }
            return processedErrorStackFrameImpl.copy(str, str2, num, num2);
        }

        @Nullable
        public final String component1() {
            return this.file;
        }

        @NotNull
        public final String component2() {
            return this.methodName;
        }

        @Nullable
        public final Integer component3() {
            return this.lineNumber;
        }

        @Nullable
        public final Integer component4() {
            return this.column;
        }

        @NotNull
        public final ProcessedErrorStackFrameImpl copy(@Nullable String str, @NotNull String methodName, @Nullable Integer num, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return new ProcessedErrorStackFrameImpl(str, methodName, num, num2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProcessedErrorStackFrameImpl)) {
                return false;
            }
            ProcessedErrorStackFrameImpl processedErrorStackFrameImpl = (ProcessedErrorStackFrameImpl) obj;
            return Intrinsics.b(this.file, processedErrorStackFrameImpl.file) && Intrinsics.b(this.methodName, processedErrorStackFrameImpl.methodName) && Intrinsics.b(this.lineNumber, processedErrorStackFrameImpl.lineNumber) && Intrinsics.b(this.column, processedErrorStackFrameImpl.column);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError.StackFrame
        @Nullable
        public Integer getColumn() {
            return this.column;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError.StackFrame
        @Nullable
        public String getFile() {
            return this.file;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError.StackFrame
        @Nullable
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ProcessedError.StackFrame
        @NotNull
        public String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            String str = this.file;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.methodName.hashCode()) * 31;
            Integer num = this.lineNumber;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.column;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ProcessedErrorStackFrameImpl(file=" + this.file + ", methodName=" + this.methodName + ", lineNumber=" + this.lineNumber + ", column=" + this.column + ")";
        }
    }

    void reportJsException(@NotNull ProcessedError processedError);
}
