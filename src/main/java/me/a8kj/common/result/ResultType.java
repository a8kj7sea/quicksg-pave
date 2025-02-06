package me.a8kj.common.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ResultType {

    ERROR(-1), // Internal error or failure
    SUCCESS(1), // Operation completed successfully
    NOT_FOUND(0), // Resource was not found
    FAILURE(2); // Operation failed due to a client-side issue

    private final int code;

}
