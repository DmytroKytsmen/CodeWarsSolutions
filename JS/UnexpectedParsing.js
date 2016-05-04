function getStatus(isBusy) {
    return (isBusy) ? {status: "busy"} : {status: "available"};
}