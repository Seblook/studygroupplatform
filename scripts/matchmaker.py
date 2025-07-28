import json

# Dummy data simulation
def match_users():
    sample = [
        {"username": "ana", "courses": ["COP3337"], "times": ["MWF-10"]},
        {"username": "rob", "courses": ["COP3337"], "times": ["MWF-10"]},
        {"username": "lisa", "courses": ["COP2210"], "times": ["TR-2"]}
    ]
    # Match by common course and time
    groups = []
    while sample:
        current = sample.pop(0)
        group = [current]
        sample = [s for s in sample if not (s['courses'] == current['courses'] and s['times'] == current['times']) or group.append(s)]
        groups.append(group)

    print(json.dumps(groups, indent=2))

if __name__ == '__main__':
    match_users()
